//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.citation

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The assignment to an organizing scheme
 *
 * The assignment to an organizing scheme.
 *
 * @param id Unique id for inter-element referencing
 * @param type The kind of classifier (e.g. publication type, keyword)
 */
@SerialName("CitationClassification")
@Serializable
public data class CitationClassification(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The kind of classifier (e.g. publication type, keyword)
   */
  public val type: CodeableConcept? = null,
  public val classifier: List<CodeableConcept> = emptyList(),
) : BackboneElement
