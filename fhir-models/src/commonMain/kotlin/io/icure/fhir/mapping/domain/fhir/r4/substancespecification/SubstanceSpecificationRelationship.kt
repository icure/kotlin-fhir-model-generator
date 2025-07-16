//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.substancespecification

import io.icure.fhir.mapping.domain.fhir.r4.Quantity
import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.range.Range
import io.icure.fhir.mapping.domain.fhir.r4.ratio.Ratio
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A link between this substance and another, with details of the relationship
 *
 * A link between this substance and another, with details of the relationship.
 *
 * @param id Unique id for inter-element referencing
 * @param substanceReference A pointer to another substance, as a resource or just a
 * representational code
 * @param substanceCodeableConcept A pointer to another substance, as a resource or just a
 * representational code
 * @param relationship For example "salt to parent", "active moiety", "starting material"
 * @param isDefining For example where an enzyme strongly bonds with a particular substance, this is
 * a defining relationship for that enzyme, out of several possible substance relationships
 * @param amountQuantity A numeric factor for the relationship, for instance to express that the
 * salt of a substance has some percentage of the active substance in relation to some other
 * @param amountRange A numeric factor for the relationship, for instance to express that the salt
 * of a substance has some percentage of the active substance in relation to some other
 * @param amountRatio A numeric factor for the relationship, for instance to express that the salt
 * of a substance has some percentage of the active substance in relation to some other
 * @param amountString A numeric factor for the relationship, for instance to express that the salt
 * of a substance has some percentage of the active substance in relation to some other
 * @param amountRatioLowLimit For use when the numeric
 * @param amountType An operator for the amount, for example "average", "approximately", "less than"
 */
@SerialName("SubstanceSpecificationRelationship")
@Serializable
public data class SubstanceSpecificationRelationship(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * A pointer to another substance, as a resource or just a representational code
   */
  public val substanceReference: Reference? = null,
  /**
   * A pointer to another substance, as a resource or just a representational code
   */
  public val substanceCodeableConcept: CodeableConcept? = null,
  /**
   * For example "salt to parent", "active moiety", "starting material"
   */
  public val relationship: CodeableConcept? = null,
  /**
   * For example where an enzyme strongly bonds with a particular substance, this is a defining
   * relationship for that enzyme, out of several possible substance relationships
   */
  public val isDefining: Boolean? = null,
  /**
   * A numeric factor for the relationship, for instance to express that the salt of a substance has
   * some percentage of the active substance in relation to some other
   */
  public val amountQuantity: Quantity? = null,
  /**
   * A numeric factor for the relationship, for instance to express that the salt of a substance has
   * some percentage of the active substance in relation to some other
   */
  public val amountRange: Range? = null,
  /**
   * A numeric factor for the relationship, for instance to express that the salt of a substance has
   * some percentage of the active substance in relation to some other
   */
  public val amountRatio: Ratio? = null,
  /**
   * A numeric factor for the relationship, for instance to express that the salt of a substance has
   * some percentage of the active substance in relation to some other
   */
  public val amountString: String? = null,
  /**
   * For use when the numeric
   */
  public val amountRatioLowLimit: Ratio? = null,
  /**
   * An operator for the amount, for example "average", "approximately", "less than"
   */
  public val amountType: CodeableConcept? = null,
  public val source: List<Reference> = emptyList(),
) : BackboneElement
