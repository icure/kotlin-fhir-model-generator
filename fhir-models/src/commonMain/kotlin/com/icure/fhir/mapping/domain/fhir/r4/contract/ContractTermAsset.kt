//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.contract

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.period.Period
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Contract Term Asset List
 *
 * Contract Term Asset List.
 *
 * @param id Unique id for inter-element referencing
 * @param scope Range of asset
 * @param relationship Kinship of the asset
 * @param condition Quality desctiption of asset
 * @param text Asset clause or question text
 */
@SerialName("ContractTermAsset")
@Serializable
public data class ContractTermAsset(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Range of asset
   */
  public val scope: CodeableConcept? = null,
  public val type: List<CodeableConcept> = emptyList(),
  public val typeReference: List<Reference> = emptyList(),
  public val subtype: List<CodeableConcept> = emptyList(),
  /**
   * Kinship of the asset
   */
  public val relationship: Coding? = null,
  public val context: List<ContractTermAssetContext> = emptyList(),
  /**
   * Quality desctiption of asset
   */
  public val condition: String? = null,
  public val periodType: List<CodeableConcept> = emptyList(),
  public val period: List<Period> = emptyList(),
  public val usePeriod: List<Period> = emptyList(),
  /**
   * Asset clause or question text
   */
  public val text: String? = null,
  public val linkId: List<String> = emptyList(),
  public val answer: List<ContractTermOfferAnswer> = emptyList(),
  public val securityLabelNumber: List<Int> = emptyList(),
  public val valuedItem: List<ContractTermAssetValuedItem> = emptyList(),
) : BackboneElement
