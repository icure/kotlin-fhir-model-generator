//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.chargeitemdefinition

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.expression.Expression
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.period.Period
import io.icure.fhir.mapping.domain.fhir.r6.relatedartifact.RelatedArtifact
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Whether or not the billing code is applicable
 *
 * Expressions that describe applicability criteria for the billing code.
 *
 * @param id Unique id for inter-element referencing
 * @param condition Boolean-valued expression
 * @param effectivePeriod When the charge item definition is expected to be used
 * @param relatedArtifact Reference to / quotation of the external source of the group of properties
 */
@SerialName("ChargeItemDefinitionApplicability")
@Serializable
public data class ChargeItemDefinitionApplicability(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Boolean-valued expression
   */
  public val condition: Expression? = null,
  /**
   * When the charge item definition is expected to be used
   */
  public val effectivePeriod: Period? = null,
  /**
   * Reference to / quotation of the external source of the group of properties
   */
  public val relatedArtifact: RelatedArtifact? = null,
) : BackboneElement
